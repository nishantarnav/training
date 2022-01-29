//write logger output to a file
const express=require("express")
const fs=require("fs")
const bodyparser=require("body-parser")
const app=express()
app.use(bodyparser.json())

const loggerMw=(req,res,next)=>{
    console.log(req.method)
    console.log(req.url)
    console.log(new Date().toDateString())
    let data={
        method:req.method,
        url:req.url,
        Date: new Date().toDateString()
    }
    // out = req.method + "\n" + req.url + "\n" + new Date().toDateString()
    // fs.writeFileSync("./public/logger.txt",out.toString())
    fs.writeFileSync("./public/logger.txt",JSON.stringify(data))
   
    next()
}

app.get("/logs",loggerMw,(req,res)=>{
    res.status(200).send("logs")
})

app.listen(3001,()=>{
    console.log("server started")
})