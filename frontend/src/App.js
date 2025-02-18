import './App.css';
import SteamNews from './components/SteamNews';
import PlayerSummaries from "./components/PlayerSummaries";

function App() {
    return (
        <div className="App">
            <PlayerSummaries />
            <SteamNews />
        </div>
    );
}

export default App;