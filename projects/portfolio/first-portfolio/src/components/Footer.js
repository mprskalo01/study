import { Container, Row, Col } from "react-bootstrap";
import navIcon1 from "../assets/img/nav-icon1.svg";
import navIcon2 from "../assets/img/nav-icon2.svg";
import navIcon3 from "../assets/img/nav-icon3.svg";

export const Footer = () => {
  return (
    <footer className='footer'>
      <Container>
        <Row className='align-item-center'>
          <Col sm={6}>
            <img src='../assets/img/logo.svg' alt='Logo' />
          </Col>
          <Col sm={6} className='text-center text-sm-end'>
            <div className='social-icon'>
              <a
                href='https://www.linkedin.com/'
                target='_blank'
                rel='noreferrer'
              >
                <img src={navIcon1} alt='Linkedin Logo' />
              </a>
              <a
                href='https://www.facebook.com/'
                target='_blank'
                rel='noreferrer'
              >
                <img src={navIcon2} alt='Facebook logo' />
              </a>
              <a
                href='https://www.instagram.com/'
                target='_blank'
                rel='noreferrer'
              >
                <img src={navIcon3} alt='Instagram Logo' />
              </a>
            </div>
            <p>Copyright 2024, All Rights Reserved</p>
          </Col>
        </Row>
      </Container>
    </footer>
  );
};
