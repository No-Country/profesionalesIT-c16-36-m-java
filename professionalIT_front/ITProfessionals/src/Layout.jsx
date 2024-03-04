import ThemeProvider from "@/components/layouts/theme-provider";
import { SiteHeader } from "@/components/layouts/site-header";
import { TailwindIndicator } from "@/components/layouts/tailwind-indicator";
import Footer from "./components/layouts/Footer";

function RootLayout({ children }) {
  return (
    <div className="min-h-screen bg-background font-sans antialiased">
      <ThemeProvider attribute='class' defaultTheme='system' enableSystem>
        <div className='relative flex min-h-screen flex-col'>
          <SiteHeader />
          <div className="flex-1 p-8">{children}</div>
          <Footer/>
        </div>
        <TailwindIndicator />
      </ThemeProvider>
    </div>
  );
}

export default RootLayout;
