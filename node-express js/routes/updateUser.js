const express=require("express")
const res = require("express/lib/response")
const router=express.Router()
const logger=require("../middleware/logger")
const User=require("../models/userModel")
router.post("/update",async (req,res)=>{
    try{
    const data=req.body
    await User.findByIdAndUpdate(data._id,{password:data.updated})
    console.log(result)
    res.send("updated successfully")
    }
    catch(err)
    {
        res.send(err)

    }
    
})
module.exports=router