import './App.css';
import SteamNews from './SteamNews';
import PlayerSummaries from "./PlayerSummaries";

function App() {
    return (
        <div className="App">
            <PlayerSummaries />
            <SteamNews />
        </div>
    );
}

export default App;