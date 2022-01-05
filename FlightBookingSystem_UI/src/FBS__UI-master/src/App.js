import React from 'react'
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import Header from './components/Header'
import Showcase from './components/Showcase'
import Footer from './components/Footer'
import Login from './components/Login.js'
import Destinations from './components/Destinations'
import Error from './components/Error'
import Search from './components/Search'
import Checkin from './components/Checkin'
import FlightList from './components/FlightList'
import AddFlight from './components/AddFlight'
import BookList from './components/BookList'
import BookingForm from './components/BookingForm'
import PaymentForm from './components/PaymentForm'


function App() {
  return (
    <div>
    <Router>
      <Header />

       <Switch>

        <Route exact path="/">
          <Showcase />

          <Destinations />
         <Footer></Footer>
        </Route>

        <Route exact path="/login">
           <Login /> 
        </Route>

        <Route exact path="/checkin">
           <Checkin></Checkin>
           <Footer></Footer>
        </Route>

        <Route exact path="/payment">
           <PaymentForm></PaymentForm>
           <Footer></Footer>
        </Route>

        <Route exact path="/adminFlightList">
           <FlightList></FlightList>
           <Footer></Footer>
        </Route>

        <Route exact path="/flightList">
          <BookList></BookList>
          <Footer></Footer>
        </Route>

        <Route exact path="/booking">
          <BookingForm></BookingForm>
          <Footer></Footer>
        </Route>


        <Route exact path="/edit-flight/:flightId">
          <AddFlight />
          <Footer></Footer>
        </Route>

        <Route exact path="/addFlight">
          <AddFlight />
          <Footer></Footer>
        </Route>

        <Route exact path="/search">
          <Search />
          <Footer></Footer>
        </Route>

        <Route path="/checkin">
          <Checkin />
          <Footer></Footer>
        </Route>

        <Route path='*'>
          <Error />
          <Footer></Footer>
        </Route>

      </Switch> 
      
     
    </Router>
    </div>

  )
}

export default App