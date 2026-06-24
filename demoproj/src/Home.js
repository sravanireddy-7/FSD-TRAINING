import { useNavigate } from "react-router-dom";

function Home() {
    const navigate=useNavigate()
    const handleClick=()=>{
        navigate("/contactus",{state:{value:{uname:"cvr"}}})
    }
  return (
    <div>
        Home Componet
        <button onClick={()=>handleClick()}>Click</button>
    </div>
  )
}

export default Home;
