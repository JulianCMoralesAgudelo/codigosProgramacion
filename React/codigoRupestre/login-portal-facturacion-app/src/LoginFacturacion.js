import React, { Component } from 'react';

class Formulario extends Component {
    constructor(props) {
        super(props);
        this.state = {
            email: 'juliancmorales10@gmail.com',
            password: 'claveCorreo'
        }
    }

    render() {
        return (
            <form>
                <input value={this.state.email} type="email" placeholder="Email" />
                <input value={this.state.password} type="password" placeholder="********" />
                <div>
                    <input type="submit" value="iniciar sesion" />
                </div>
            </form>
        )

    }

}

class LoginFacturacion extends Component {
    render() {
        return (
            <div>
                <Formulario />
            </div>
        )
    }
}

export default LoginFacturacion;