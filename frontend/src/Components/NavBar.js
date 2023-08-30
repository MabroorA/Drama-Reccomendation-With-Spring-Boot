import { Children } from "react"


export default function NavBar() {
    return (
        <nav className ="nav">
            <a href="/" class = "site-title" >Site Name</a>
            <ul>
                <CustomLink href ="/Shows">Shows</CustomLink>
                <CustomLink href ="/Actors">Actors</CustomLink>
                
                
            </ul>
        </nav>
    )
}

function CustomLink({href,children, ...props}){
    const path = window.location.pathname
    return (
        <li className={path === href ? "active" : ""}>
            <a href = {href} {...props}> {children} </a>
        </li>
    )
}