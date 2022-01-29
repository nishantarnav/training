const express=require("express")
const router=express.Router()
const logger=require("../middleware/logger")
const User=require("../models/userModel")
router.get("/findall",async(req,res)=>{
    const result=await User.find()
    // const test=result.map((item)=>{
    //     const pass=item.password
    //     const st="*".repeat(pass.length)
    //     const arr=[{
    //         email:item.email,
    //         password:st,
    //         mobile:item.mobile,
    //         country:item.country,
    //         pincode:item.pincode,
    //         address:item.address

    //     }]
    //     return arr
    // })
    console.log(result)
    res.send(result)
})
module.exports=router