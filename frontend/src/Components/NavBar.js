import { children } from "react"
import { Link,useMatch,useResolvedPath } from "react-router-dom"

export default function NavBar() {
    return (
        <nav className ="nav">
            <Link to="/" class = "site-title" >Site Name</Link>
            <ul>
                <CustomLink to ="/Shows">Shows</CustomLink>
                <CustomLink to ="/Actors">Actors</CustomLink> 
            </ul>
        </nav>
    )
}

function CustomLink({ to, children, ...props}){
    const resolvedPath = useResolvedPath(to)
    const isActive = useMatch({ path: resolvedPath.pathname, end :true})
    return (
        <li className={isActive ? "active" : ""}>
            <Link to = {to} {...props}> {children} </Link>
        </li>
    )
}