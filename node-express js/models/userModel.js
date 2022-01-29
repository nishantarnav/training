const express=require("express")
const app=express()
const mongoose=require("mongoose")
mongoose.connect("mongodb+srv://himanshiagrawal:<password>@cluster0.4fwbf.mongodb.net/myFirstDatabase?retryWrites=true&w=majority",
{useNewUrlParser: true, useUnifiedTopology: true})

// const user = mongoose.model("publications", {
//     author: String,
//     password: String,
//     userName: String
// })
// const user1 = new user({
//     author: "authorABC",
//     password: "pass123",
//     userName: "testauthor"
// })
// user1.save().then(() => console.log("User added successfully!!!"))

const User=mongoose.model("Customer",{
   email:{
    type:String,
    unique:true,
    required:[true,"please enter the email"],
   },
   password:{
       type:String,
       required:[true,"enter your pasword"],
       //select:false
   }
   ,
   mobile:{
        type:Number,
        required:[true,"enter your mobile number"],
        minlength:10,
        maxlenghth:10,
   },
   country:{
       type:String,
       default:"IND",
       required:true
   },
   area:String,
   pincode:{
        type:Number,
        required:true
   },
   address:String
})

module.exports=User
