const http = require('node:http')
const express = require('express')
const app = express()
app.get("/",(req,res) =>
{
return res.sendFile(__dirname + '/index.html')
})
function myHandle(req,res){

}
const server = http.createServer(app)
server.listen(2000,()=> console.log('server is ready'))