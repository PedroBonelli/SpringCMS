export default class SaveContentPageButton{
    htmlId;
    onClickFn;
    apiClient;
    elementRepresentation;

    constructor(htmlId, onClickFn, apiClient){
        this.htmlId = htmlId;
        this.apiClient = apiClient;
        this.onClickFn = onClickFn;
        this.elementRepresentation = document.getElementById(this.htmlId);
        this.elementRepresentation.addEventListener('click', () => {
            this.onClickFn(this.apiClient)
        });
    }

}