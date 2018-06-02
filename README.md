# Build Excerpt

Reads several web pages and builds small HTML snippets with excerpts, to be used within a blog post with curated links.

Example:

    ./build/install/buildexcerpt/bin/buildexcerpt https://www.interaction-design.org/literature/article/how-to-visualize-your-qualitative-user-research-results-for-maximum-impact https://justaskusers.com

will generate this:

    <div class="excerptContainer">
        <div class="excerptImage">
            <img src="https://public-media.interaction-design.org/images/ux-daily/article_131004_hero_5a32b25514ca99.99475750.png" />
        </div>
        <div class="excerptText">
            <h3>How to Visualize Your Qualitative User Research Results for Maximum Impact</h3>
            <p>When thinking about visualization of research results, many people will automatically have an image of a graph in mind. Do you have that image, too? You would be right in thinking that many research results benefit from a graph-like visualization, showing trends and anomalies. But this is mainly tru...</p>
            <p><a href="https://www.interaction-design.org/literature/article/how-to-visualize-your-qualitative-user-research-results-for-maximum-impact">Read more</a></p>
        </div>
    </div>

    <div class="excerptContainer">
        <div class="excerptImage">
            <img src="https://justaskusers.com/wp-content/uploads/2018/03/jau-twitter-image.png" />
        </div>
        <div class="excerptText">
            <h3>Just Ask Users – Plan, manage and make sense of UX research work</h3>
            <p>The tool for User Experience Researchers: Curate meaningful collections of user feedback, get insights and connect them to product decisions – UX research minus the mess!</p>
            <p><a href="https://justaskusers.com/">Read more</a></p>
        </div>
    </div>
