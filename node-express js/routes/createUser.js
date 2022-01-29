const express=require("express")
const { mobile } = require("jade/lib/doctypes")
const router=express.Router()
const User=require("../models/userModel")
router.post("/signup",async (req,res)=>{
console.log(req.body)
const data=req.body
try
{
const user1=new User(
    {
        email:data.email,
        password:data.password,
        mobile:data.mobile,
        area:data.area,
        pincode:data.pincode,
        country:data.country,
        address:data.area+data.pincode+data.country

}
)
await user1.save().then(()=>res.send("user added successfully"))
}
catch(err)
{
    res.send(err)
    console.log(err)
}
// user1.save().then(()=>console.log("user added successfully"))
})
module.exports=router