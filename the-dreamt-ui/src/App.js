import React from 'react';
import { ThemeProvider } from '@material-ui/core/styles';
import CssBaseline from '@material-ui/core/CssBaseline';
import theme from './theme';
import NavBar from './components/NavBar';

const App = () => (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <div>
        <NavBar/>
      </div>
    </ThemeProvider>
);

export default App;
