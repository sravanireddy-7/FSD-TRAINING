const http = require('node:http')
const express = require('express')
const app = express()
app.get("/",(req,res) =>
{
return res.sendFile(__dirname + '/users.json')
})
function myHandle(req,res){

}
const server = http.createServer(app)
server.listen(3000, () => console.log('server is ready'));