import axios from 'axios'

const url = "http://localhost:8081"

const instance = axios.create({
    baseURL:url
})

const post = (url,data)=>{
    return instance.post(url,data)
}

const get = (url)=>{
    return instance.get(url)
}

const getWithParams = (url, params) => {
    const finalUrl = `${url}?${new URLSearchParams(params).toString()}`;
    console.log("URL con parámetros:", finalUrl);
    return instance.get(finalUrl);
};

const getWithToken = async (url)=>{
    const token = await localStorage.getItem('token')
    if(token){
        return await instance.get(url,{
            headers:{
                'Authorization':"Bearer "+token
            }
        })
    }
}


const postWithToken = async (url,data)=>{
    const token = localStorage.getItem("token")
    if(token){
        return await instance.post(url,data,{
            headers:{
                'Authorization':"Bearer "+localStorage.getItem("token")
            }
        })
    }

    return {
        data:{
            failed:true,
            message:"No tienes token"
        }
    }
    
}

const putWithToken = async (url,data)=>{
    const token = localStorage.getItem("token")
    if(token){
        return await instance.put(url,data,{
            headers:{
                'Authorization':"Bearer "+localStorage.getItem("token")
            }
        })
    }
}

const deleteWithToken = async (url)=>{
    const token = localStorage.getItem("token")
    if(token){
        return await instance.delete(url,{
            headers:{
                'Authorization':"Bearer "+localStorage.getItem("token")
            }
        })
    }
}

export default instance

export {post,postWithToken,get,getWithToken,putWithToken,deleteWithToken,getWithParams}