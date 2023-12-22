import axios from "axios";
import { useEffect, useState } from "react";

const Message = () => {

    const [message, setMessage] = useState('');

    useEffect(() => {
        // i am using localhost but it need public ip of cloud vm instance
        axios.get("http://localhost:8080/api/hello").then(res => {
            console.log(res)
            setMessage(res.data)
        })
    }, [])

    return (
        <div>
            <h1>Message</h1>
            {message}
        </div>
    );
}

export default Message;