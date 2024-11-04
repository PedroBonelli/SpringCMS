export default class APIClient{
    baseUrl;

    constructor(baseUrl){
        this.baseUrl = baseUrl;
    }

    requestBuilder(url, method, content){
        return new Request(
            url,
            {
              method: method,
              body: content,
              headers: new Headers({
                'Content-Type': 'application/json'
              })  
            }
        )
    }

    // promiseHandler(promise){
     
    // }

    async postContentPage(contentPage){
        const url = this.baseUrl + "contentPage";
        const contentPageJSON = JSON.stringify(contentPage);

        console.log(contentPageJSON)

        const request = this.requestBuilder(url, 'POST', contentPageJSON);
        return await((await fetch(request)).json())
    }

    async postContent(content) {
        const url = this.baseUrl + "content"
        const contentJSON = JSON.stringify(content)
        const request = this.requestBuilder(url, 'POST', contentJSON)
        return await (await fetch(request)).json()
    }



}