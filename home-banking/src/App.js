import React from 'react';
import './App.css';
import AppBar from '@material-ui/core/AppBar';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import Toolbar from '@material-ui/core/Toolbar';
import Persona from './Component/Home/Admin/Persona';
import Sucursal from './Component/Home/Admin/Sucursal';
import { Grid, Row, Col } from 'react-flexbox-grid';


function App() {
  return (

<Grid className="wallpaper">
       <Row>
         <AppBar className="appBar" color="secondary">
           <Toolbar>     <i class="material-icons">account_balance</i>
             <Typography color='inherit'>
               HomeBancking LoreFior
             </Typography>
             <Button color='inherit'><i class="material-icons">home</i></Button>
             <Button color='inherit'><i class="material-icons">widgets</i></Button>
             <Button color='inherit'><i class="material-icons">settings</i></Button>
             <Button color='inherit'><i class="material-icons">person</i></Button>
           </Toolbar>
         </AppBar>
       </Row>
       <Row>
           <Col xs={12} md={12}>
<Persona className="tablaUsuarios"></Persona>
<Sucursal></Sucursal>
           </Col>
       </Row>

    </Grid>

  );
}

export default App;
