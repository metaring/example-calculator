/**
 * Copyright 2020 MetaRing s.r.l.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
window.listAllOperators = async function listAllOperators() {
    var response = await window.metaring.COM_METARING_EXAMPLE_CALCULATOR_LIST_OPERATORS();
    if(response.verdict !== 'SUCCESS') {
        return;
    }
    var operators = document.getElementById('operators');
    var select = document.getElementsByTagName('select')[0];
    select.onchange = window.operation;
    for(var i in response.result) {
        var operator = response.result[i].toUpperCase();

        var button = document.createElement('button');
        button.className = 'btn btn-primary';
        button.innerHTML = operator;
        button.onclick = window.explicitOperation;

        var col = document.createElement('div');
        col.className = 'col-lg-2 col-md-2 col-sm-2 col-xs-2';
        col.appendChild(button);
        operators.append(col);

        var option = document.createElement('option');
        option.value = operator;
        option.innerHTML = operator;
        select.appendChild(option);
    }
};

window.explicitOperation = async function explicitOperation(e) {
    e && (e.preventDefault && e.preventDefault(true)), (e.stopPropagation && e.stopPropagation(true));
    var value = e.currentTarget.innerHTML;
    var operands = window.extractOperands();
    if(!operands) {
        return;
    }
    window.elaborateResponse(await window.metaring["COM_METARING_EXAMPLE_CALCULATOR_" + value](operands));
};

window.operation = async function operation(e) {
    e && (e.preventDefault && e.preventDefault(true)), (e.stopPropagation && e.stopPropagation(true));
    var value = e.currentTarget.value;
    if(value.indexOf('==') === 0) {
        return;
    }
    var operands = window.extractOperands();
    if(!operands) {
        return;
    }
    var operation = {
        operands,
        operator : value.substring(0, 3)
    };
    window.elaborateResponse(await window.metaring.COM_METARING_EXAMPLE_CALCULATOR_DO_OPERATION(operation));
};

window.printResult = function printResult(message) {
    document.getElementById('result').placeholder = message || message === 0 ? message : '';
};

window.elaborateResponse = function elaborateResponse(response) {
    if(response.verdict === 'SUCCESS') {
        return window.printResult(response.result);
    }
    return window.printResult('ERROR - ' + (response.errorData ? (response.errorData.codeName + ' - ' + response.errorData.payload.join('')) || "Something went wrong" : "Something went wrong"))
};

window.extractOperands = function extractOperands() {
    window.printResult();
    var operands = {
        first : parseFloat(document.getElementById('firstOperand').value),
        second : parseFloat(document.getElementById('secondOperand').value)
    };
    return isNaN(operands.first) ? window.printResult('ERROR: First operand must be a valid number!') : isNaN(operands.second) ? window.printResult('ERROR: Second operand must be a valid number!') : operands;
};

window.onServerManager = function onServerManager() {
    window.metaring = new functionalities(window.serverManager.call);
    window.listAllOperators();
};

window.onload = async function onload() {
    window.serverManager = new ServerManager(() => window.location.reload(), undefined, window.onServerManager);
};