import axios from 'axios';
import { useEffect } from 'react';

let dream;

function Home() {
    
    useEffect(() => {
        dream = axios.get('/dream')
                    .then(function (response) {
                        console.log(response);
                    })
    });
    
    return (
        <h1>
            Home
            {dream}
        </h1>
    )
};

export default Home;