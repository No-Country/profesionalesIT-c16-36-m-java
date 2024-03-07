import { Route } from 'react-router-dom';
import { BrowserRouter as Router, Routes } from 'react-router-dom';
import Dashbaord from './pages/admin/professionals/Dashbaord';
import Landing from './pages/public/landing/Landing';
import SignIn from './pages/public/sign-in/SignIn';
import SignUp from './pages/public/sign-up/SignUp';
import Search from './pages/public/search/Search';
import Profile from './pages/admin/professionals/Profile';
import Info from './pages/admin/professionals/Info';
import RootLayout from './Layout';
import Catalog from './pages/admin/professionals/Catalog';
import ProfileContact from './pages/admin/commons/ChatContact';
import { Company } from './pages/admin/companies/Company';

export default function Root() {
  return (
    <Router>
      <RootLayout>
        <Routes>
          <Route path='/' element={<Landing />} />
          <Route path='login' element={<SignIn />} />
          <Route path='signup' element={<SignUp />} />
          <Route path='dashboard' element={<Dashbaord />} />
          <Route path='search' element={<Search />} />
          <Route path='profile/admin' element={<Profile />} />
          <Route path='profile/info' element={<Info/>} />
          <Route path='professionals/catalog' element={<Catalog/>} />
          <Route path='profile/contact' element={<ProfileContact/>} />
          <Route path='company/info' element={<Company/>} />
        </Routes>
      </RootLayout>
    </Router>
  );
}
