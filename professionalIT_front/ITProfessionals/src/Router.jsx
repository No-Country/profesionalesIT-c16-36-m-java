import { Route } from 'react-router-dom';
import { BrowserRouter as Router, Routes } from 'react-router-dom';
import Dashbaord from './pages/admin/professionals/Dashbaord';
import Landing from './pages/public/landing/Landing';
import SignIn from './pages/public/sign-in/SignIn';
import SignUp from './pages/public/sign-up/SignUp';
import Search from './pages/public/search/Search';
import Profile from './pages/admin/professionals/Profile';
import Info from './pages/admin/professionals/Info';

export default function Root() {
  return (
    <Router>
        <Routes>
          
          <Route path='/' element={<Landing />} />
          <Route path='login' element={<SignIn />} />
          <Route path='logout' element={<SignUp />} />
          <Route path='dashboard' element={<Dashbaord />} />
          <Route path='search' element={<Search />} />
          <Route path='profile/admin' element={<Profile />} />
          <Route path='profile/info' element={<Info/>} />
          
        </Routes>
    </Router>
  );
}
