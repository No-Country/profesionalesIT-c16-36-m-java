import { cva } from 'class-variance-authority';
import { cn } from '@/utils';
import { forwardRef } from 'react';

const containerVariants = cva('w-full px-4 block mx-auto sm:px-6', {
  variants: {
    maxWidth: {
      mobile: 'max-w-screen-sm',
      tablet: 'max-w-screen-lg',
      laptop: 'max-w-screen-xl',
      desktop: 'max-w-screen-3xl',
    },
  },
  defaultVariants: {
    maxWidth: 'desktop',
  },
});

/**
 * @typedef {Object} props props
 * @property {string} [props.className] Clases de Tailwindcss.
 * @property {('mobile' | 'tablet' | 'laptop' | 'desktop')} [props.maxWidth] El ancho máximo del Container
 * @property {JSX.Element} props.children Children
 * @property {object} [ref] Ref
 */

/**
 * @typedef {props & import('react').HTMLProps<HTMLDivElement>} ContainerProps ContainerProps
 */

/**
 * @param {ContainerProps} props ContainerProps
 * @returns {import('react').ReactNode} Un componente contenedor.
 **/

function ContainerBase({ className, maxWidth, children, as, ...props }, ref) {
  const Comp = as || 'div';

  return (
    <Comp ref={ref} className={cn(containerVariants({ maxWidth, className }))} {...props}>
      {children}
    </Comp>
  );
}

const Container = forwardRef(ContainerBase);

Container.displayName = 'Container';

export default Container;
