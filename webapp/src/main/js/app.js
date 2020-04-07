const React = require('react');
const ReactDOM = require('react-dom');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {employees: []};
    }

    componentDidMount() {

    }

    render() {
        return(
        <div>
            <table>
                <th>
                    <td>header1</td>
                    <td>header2</td>
                    <td>header3</td>
                </th>
            </table>
        </div>
        );

    }
}


ReactDOM.render(
    <App />,
    document.getElementById('react')
)