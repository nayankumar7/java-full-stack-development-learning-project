import React from 'react'


const Signup = () => {
  return (
    <div className="signup">
      <h1>signup page</h1>
      
      <div className="enter-frist-name"><p>Enter Frist Name : </p><input type="text" /></div>
      <div className="enter-second-name"><p>Enter Middle Name :</p> <input type="text" /></div>
      <div className="enter-last-name"><p>Enter Last name : </p><input type="text" /></div>
      <div className="email">
        <p id='text-email'className='textsign'>Enter Email Address : </p>
        <input type="email" name="" id="" /><button>send otp</button>
        
        <div className="enter-otp-email">
          <p>enter email otp : </p>
          <input type="text"className='otp-email' />
          <button>verify</button>
        </div>
      </div>
      <div className="mobile-number"><p>enter mobile number : </p><input type="text" name="" id="" /><button>send otp</button>
      <div className="enter-otp"><p>enter mobile number otp : </p><input type="text" /><button>verify</button></div></div>
      <div className="password">
        <p className='textsign' id='text-pass'>create password : </p>
        <input type="password" id='password' className='input-area' /><br />
        <p className='textsign' id='text-pass'>enter created password : </p>
        <input type="password" id='password' className='input-area' />
      </div>
      <div className="create-username"><p>create username : </p><input type="text" /><button>find</button></div>
      <div className="submit-button">
        <button className='submit' id='submit-btn'>submit</button>
      </div>
    </div>
  )
}

export default Signup