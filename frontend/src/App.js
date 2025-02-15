import './App.css';
import {useEffect, useState} from "react";

function App() {
    const [list, setList] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/api/steamnews/730")
            .then((response) => response.json())
            .then((data) => {
                console.log("API-respons:", data);
                setList(data.appnews.newsitems || []);
            })
            .catch((error) => console.error("Error fetching data:", error));
    }, []);

    return (
        <div className="App">
            <div className="Steam-news">
                <h1>Counter Strike News</h1>
                <div className="wrapper">
                    <ul>
                        {list.length > 0 ? (
                            list.map((item) => {
                                // Separera sektionerna i contents baserat på mönstret [ SECTION NAME ]
                                const sections = item.contents.split(/\n(?=\[ [A-Z ]+ \])/).map((section) => {
                                    // Extrahera sektionstiteln
                                    const titleMatch = section.match(/\[ ([A-Z ]+) \]/);
                                    const title = titleMatch ? titleMatch[1] : "Okänd sektion";

                                    // Extrahera och formatera innehållet i listan
                                    const listItems = section
                                        .replace(/\[ [A-Z ]+ \]/, "") // Ta bort sektionstiteln från texten
                                        .replace(/\[list\]/g, "") // Ta bort [list]
                                        .replace(/\[\/list\]/g, "") // Ta bort [/list]
                                        .split("[*]") // Dela upp i rader baserat på [*]
                                        .filter((line) => line.trim() !== ""); // Ta bort tomma rader

                                    return (
                                        <div key={title}>
                                            <h3>{title}</h3>
                                            <ul id="specialUl">
                                                {listItems.map((line, index) => (
                                                    <li key={index}>{line.trim()}</li>
                                                ))}
                                            </ul>
                                        </div>
                                    );
                                });

                                return (
                                    <div className="news-card">
                                        <li key={item.id}>
                                            <h3>{item.title}</h3>
                                            <p>{new Date(item.date * 1000).toDateString()}</p>
                                            {sections}
                                            <a href={item.url} target="_blank" rel="noopener noreferrer">
                                                Läs mer
                                            </a>
                                        </li>
                                    </div>
                                );
                            })
                        ) : (
                            <p>Inga nyheter att visa...</p>
                        )}
                    </ul>
                </div>
            </div>
        </div>
    );
}

export default App;
