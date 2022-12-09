import { Component } from "react";
import MovieList from "../components/MovieList";
class AllMovies extends Component {
    state={
        allMovies:[]
    };

    baseURL="http://localhost:8200/movies"

    async componentDidMount(){
        const response = await fetch(this.baseURL);
        const body=await response.json();
        this.setState({allMovies:body})
    }
  render() {
    const {allMovies}=this.state
    console.log(allMovies)
    return <div>All Movies Page
        <MovieList movies={allMovies}/>
    </div>;
  }
}

export default AllMovies;
