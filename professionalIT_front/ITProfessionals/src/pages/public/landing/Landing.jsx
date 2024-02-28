import Container from '@/components/ui/Container';
import { Button, Typography } from '@material-tailwind/react';

export default function Landing() {
  return (
    <Container className='py-8 min-h-screen bg-primary text-center' as='main'>
      <h2 className=' bg-blue-gray-500'>Landing page</h2>
      <Typography h1 color='white'>
        Welcome to IT Professionals
      </Typography>
      <Button className=' bg-secondary' color='lightBlue' ripple='light'>
        Get Started
      </Button>
    </Container>
  );
}
