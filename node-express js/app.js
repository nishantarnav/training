const express=require("express")
const path=require("path")
const app=express()

app.get("/home",(req,res)=>{
    console.log(req)
    res.sendFile(path.join(__dirname,'./public/trial.html'));
})
//params
app.get("/home/pages/:name",(req,res)=>{
    console.log(req)
    res.send("Name is sent")
})
app.all("*",(req,res)=>{
    res.status(404).send("File not found 404")
})
app.listen(3002,()=>{
    console.log("server started at 3002")
})