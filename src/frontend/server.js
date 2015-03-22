var http = require('http');
var connect = require('connect')
httpProxy = require('http-proxy');
var serveStatic = require('serve-static');
var proxy = httpProxy.createProxyServer({});


var app = connect();

app.use(serveStatic('dist', {'index': ['index.html', 'index.htm']}));

app.use('/PdfServlet',function(req, res, next){
	proxy.web(req, res, {
			target: 'http://52.1.164.93:8080/openpkw/PdfServlet?a'
	});
});
 
http.createServer(app).listen(5050); 
console.log("listening on port 5050");