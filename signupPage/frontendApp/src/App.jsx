import { useState } from 'react'
import './App.css'
import  "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import Signup from './signup/signup'


function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      
      <Signup/>
     
    </>
  )
}

export default App
