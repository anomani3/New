import React from 'react'
import bgImage from '../assets/airVid.mp4'

const Showcase = () => {
  return (
    <section className='showcase'>
      <div className='showcase-overlay'>
      <video autoPlay loop muted>

          <source src={bgImage} type="video/mp4"></source>

           </video>
        <h1>WELCOME TO <b>SWISS AIRLINES</b></h1>
        <p>
        Fly like a CEO, pay like a temp,	Catch the Spirit!!!!!
        </p>
      </div>
    </section>
  )
}

export default Showcase
