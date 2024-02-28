import withMT from '@material-tailwind/react/utils/withMT';

const fontFamily = {
  sans: ['Roboto', 'sans-serif'],
  serif: ['Roboto Slab', 'serif'],
  body: ['Roboto', 'sans-serif'],
  orbitron: ['Orbitron', 'sans-serif'],
};

export default withMT({
  content: [
    './index.html',
    './src/**/*.{vue,js,ts,jsx,tsx}',
    './node_modules/@material-tailwind/react/components/**/*.{js,ts,jsx,tsx}',
    './node_modules/@material-tailwind/react/theme/components/**/*.{js,ts,jsx,tsx}',
  ],
  theme: {
    colors: {
      primary: '#222831',
      secondary: '#00ADB5',
      primary_clearer: '#393E46',
      darktext: '#36343B',
      lightText: '#EEEEEE',
      gray: '#BFBFBF',
    },
    fontFamily,
    extend: {
      screens: {
        '3xl': '1440px',
      },
    },
  },
  plugins: [],
});
