//render html pages from express
// const express=require("express")
// const app=express()
// app.get("/home",(req,res)=>{
//     res.send({prname:"xyz"})
// })
// app.listen(3001,()=>{
//     console.log("server started")
// })

//sending query data through URL
const express=require("express")
const bodyparser=require("body-parser")
const app=express()
app.use(bodyparser.json())

const loggerMw=(req,res,next)=>{
    console.log(req.method)
    console.log(req.url)
    console.log(new Date().toDateString())
    next()
}

app.get("/home",loggerMw,(req,res)=>{
    console.log(req)
    res.send("request recieved")
})
//params
app.get("/products/productsearch/:prname",(req,res)=>{
    console.log(req)
    res.send("Product searched")
})
app.post("/products",(req,res)=>{
    console.log(req)
    res.send("success")
})
app.post("/updatepassword",(req,res)=>{
    console.log(req.body)
    res.send("Password updated")
})
app.all("*",(req,res)=>{
    res.status(404).send("File not found 404")
})
app.listen(3001,()=>{
    console.log("server started")
})