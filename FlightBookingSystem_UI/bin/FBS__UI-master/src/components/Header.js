import React from 'react'
import { Link } from 'react-router-dom'
import flightlogo from '../assets/airplane.jpg'

const Header = () => {
  return (
    <header className='header'>
      <div>
        <Link className='links' to='/'>
        <img src={flightlogo} alt='destination-1' />
        </Link>
      </div>

      <nav className='navbar'>
        <ul>
          <Link className='links' to='/login'>
            Admin
          </Link>

          <Link className='links' to='/search'>
            Search
          </Link>

          <Link className='links' to='/checkin'>
            Checkin
          </Link>

         
          
        </ul>
      </nav>
    </header>
  )
}

export default Header
