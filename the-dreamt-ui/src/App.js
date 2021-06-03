import React from 'react';
import { BrowserRouter as Router, Link, Route, Switch } from 'react-router-dom';
import { ThemeProvider } from '@material-ui/core/styles';
import CssBaseline from '@material-ui/core/CssBaseline';
import theme from './theme';
import NavBar from './components/NavBar';
import Home from './components/Home';

const App = () => (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <div>
        <NavBar/>
        <Router>
          <Link to='/'>
            Home
          </Link>
          <Switch>
            <Route path='/'>
              <Home />
            </Route>
          </Switch>
        </Router>
      </div>
    </ThemeProvider>
);

export default App;
