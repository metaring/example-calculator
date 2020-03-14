function functionalities(endPointProvider) {

  if(!endPointProvider) {
    throw 'End Point Provider must be defined';
  }

  var context = this;
  context.endPointProvider = endPointProvider;

  context.COM_METARING_EXAMPLE_CALCULATOR_DIVIDE = function(input, callback) {
    return new Promise(function(accept) {
      setTimeout(function() {
        var internalCallback = function(response, request) {
          accept(response);
          callback && callback(response, request);
        };
        context.endPointProvider({
          id : parseInt((Math.random() * new Date().getTime() * Math.random() + new Date().getTime()).toString().split('.').join()),
          name : 'com.metaring.example.calculator.divide',
          param : input || null
        }, internalCallback);
      });
    });
  };

  context.COM_METARING_EXAMPLE_CALCULATOR_DO_OPERATION = function(input, callback) {
    return new Promise(function(accept) {
      setTimeout(function() {
        var internalCallback = function(response, request) {
          accept(response);
          callback && callback(response, request);
        };
        context.endPointProvider({
          id : parseInt((Math.random() * new Date().getTime() * Math.random() + new Date().getTime()).toString().split('.').join()),
          name : 'com.metaring.example.calculator.doOperation',
          param : input || null
        }, internalCallback);
      });
    });
  };

  context.COM_METARING_EXAMPLE_CALCULATOR_LIST_OPERATORS = function(callback) {
    return new Promise(function(accept) {
      setTimeout(function() {
        var internalCallback = function(response, request) {
          accept(response);
          callback && callback(response, request);
        };
        context.endPointProvider({
          id : parseInt((Math.random() * new Date().getTime() * Math.random() + new Date().getTime()).toString().split('.').join()),
          name : 'com.metaring.example.calculator.listOperators',
        }, internalCallback);
      });
    });
  };

  context.COM_METARING_EXAMPLE_CALCULATOR_MULTIPLY = function(input, callback) {
    return new Promise(function(accept) {
      setTimeout(function() {
        var internalCallback = function(response, request) {
          accept(response);
          callback && callback(response, request);
        };
        context.endPointProvider({
          id : parseInt((Math.random() * new Date().getTime() * Math.random() + new Date().getTime()).toString().split('.').join()),
          name : 'com.metaring.example.calculator.multiply',
          param : input || null
        }, internalCallback);
      });
    });
  };

  context.COM_METARING_EXAMPLE_CALCULATOR_SUBTRACT = function(input, callback) {
    return new Promise(function(accept) {
      setTimeout(function() {
        var internalCallback = function(response, request) {
          accept(response);
          callback && callback(response, request);
        };
        context.endPointProvider({
          id : parseInt((Math.random() * new Date().getTime() * Math.random() + new Date().getTime()).toString().split('.').join()),
          name : 'com.metaring.example.calculator.subtract',
          param : input || null
        }, internalCallback);
      });
    });
  };

  context.COM_METARING_EXAMPLE_CALCULATOR_SUM = function(input, callback) {
    return new Promise(function(accept) {
      setTimeout(function() {
        var internalCallback = function(response, request) {
          accept(response);
          callback && callback(response, request);
        };
        context.endPointProvider({
          id : parseInt((Math.random() * new Date().getTime() * Math.random() + new Date().getTime()).toString().split('.').join()),
          name : 'com.metaring.example.calculator.sum',
          param : input || null
        }, internalCallback);
      });
    });
  };
}
