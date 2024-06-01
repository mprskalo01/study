import { Container, Row, Col } from "react-bootstrap";
import Carousel from "react-multi-carousel";
import "react-multi-carousel/lib/styles.css";
import meter1 from "../assets/img/meter1.svg";
import meter2 from "../assets/img/meter2.svg";
import meter3 from "../assets/img/meter3.svg";
import colorSharp from "../assets/img/color-sharp.png";

export const Skills = () => {
  const responsive = {
    superLargeDesktop: {
      // the naming can be any, depends on you.
      breakpoint: { max: 4000, min: 3000 },
      items: 5,
    },
    desktop: {
      breakpoint: { max: 3000, min: 1024 },
      items: 3,
    },
    tablet: {
      breakpoint: { max: 1024, min: 464 },
      items: 2,
    },
    mobile: {
      breakpoint: { max: 464, min: 0 },
      items: 1,
    },
  };
  return (
    <section className='skill' id='skills'>
      <Container>
        <Row>
          <Col>
            <div className='skill-bx'>
              <h2>Skills</h2>
              <p>
                Lorem ipsum, dolor sit amet consectetur adipisicing elit. Odio
                quod, harum alias sed, saepe vero, est voluptas repudiandae fuga
                architecto minima qui nam aliquam quae aspernatur? Voluptates
                repudiandae veritatis adipisci!
              </p>
              <Carousel
                responsive={responsive}
                infinite={true}
                className='skill-slider'
              >
                <div className='item'>
                  <img src={meter1} alt='Displaying skills' />
                  <h5>React</h5>
                </div>
                <div className='item'>
                  <img src={meter2} alt='Displaying skills' />
                  <h5>Nodejs</h5>
                </div>
                <div className='item'>
                  <img src={meter3} alt='Displaying skills' />
                  <h5>Databases</h5>
                </div>
                <div className='item'>
                  <img src={meter1} alt='Displaying skills' />
                  <h5>Logo design</h5>
                </div>
              </Carousel>
            </div>
          </Col>
        </Row>
      </Container>
      <img
        src={colorSharp}
        alt='displaying fine notes'
        className='background-image-left'
      />
    </section>
  );
};
