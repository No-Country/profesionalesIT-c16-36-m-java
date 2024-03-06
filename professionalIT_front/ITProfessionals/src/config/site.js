const siteConfig = {
  name: "ProfesionalesIT",
  description: "Beautifully designed components built with Radix UI and Tailwind CSS.",
  mainNav: [
    {
      title: "Home",
      href: "/",
    },
    {
      title: "Professionals",
      href: "/professionals/catalog",
    },
    {
      title: "Messages",
      href: "profile/conversations",
    },
  ],
  links: {
    twitter: "https://twitter.com/shadcn",
    github: "https://github.com/shadcn/ui",
    docs: "https://ui.shadcn.com",
  },
};

const SiteConfig = typeof siteConfig;

export { siteConfig, SiteConfig };
