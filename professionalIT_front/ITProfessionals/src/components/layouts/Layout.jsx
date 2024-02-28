// Layout.js
import React from 'react';
import Container from '@/components/ui/Container';

function Layout({ children }) {
  return (
    <main className='py-8 min-h-screen bg-primary text-white'>
        {children}
    </main>
  );
}

export default Layout;
