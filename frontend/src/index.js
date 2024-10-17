import { SnackbarProvider } from 'notistack';
import ReactDOM from 'react-dom/client';
import { HelmetProvider } from 'react-helmet-async';
import { BrowserRouter } from 'react-router-dom';
import App from './App';
import ScrollToTop from './components/scroll-to-top';
import reportWebVitals from './reportWebVitals';
import * as serviceWorker from './serviceWorker';
import ThemeProvider from './theme';

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  <HelmetProvider>
    <BrowserRouter>
      <ThemeProvider>
        <ScrollToTop />
        <SnackbarProvider preventDuplicate>
          <App />
        </SnackbarProvider>
      </ThemeProvider>
    </BrowserRouter>
  </HelmetProvider>
);

serviceWorker.unregister();


reportWebVitals();
