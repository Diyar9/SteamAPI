import { useEffect, useState } from "react";
import "./App.css";

function SteamNews() {
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
        <div className="Steam-news">
            <h1>Counter Strike News</h1>
            <div className="wrapper">
                <ul>
                    {list.length > 0 ? (
                        list.map((item) => {
                            const sections = item.contents
                                .split(/\n(?=\[ [A-Z ]+ \])/)
                                .map((section) => {
                                    const titleMatch = section.match(/\[ ([A-Z ]+) \]/);
                                    const title = titleMatch ? titleMatch[1] : "Okänd sektion";

                                    const listItems = section
                                        .replace(/\[ [A-Z ]+ \]/, "")
                                        .replace(/\[list\]/g, "")
                                        .replace(/\[\/list\]/g, "")
                                        .split("[*]")
                                        .filter((line) => line.trim() !== "");

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
                                <div className="news-card" key={item.id}>
                                    <li>
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
    );
}

export default SteamNews;
