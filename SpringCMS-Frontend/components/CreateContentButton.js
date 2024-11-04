export default class CreateContentButton{
    htmlId;
    htmlNodeTargetId;
    contentType;
    elementRepresentation;
    idCounter;

    constructor(htmlId, contentType, htmlNodeTargetId){
        this.idCounter = 0;
        this.htmlId = htmlId;
        this.contentType = contentType;
        this.htmlNodeTargetId = htmlNodeTargetId;
        this.elementRepresentation = document.getElementById(this.htmlId);
        this.elementRepresentation.addEventListener('click', () => {
            this.idCounter++;
            const newContentElement = document.createElement('textarea');
            newContentElement.id = `${this.contentType}-${this.idCounter}`;
            newContentElement.classList.add('content');
            document.getElementById(this.htmlNodeTargetId).appendChild(newContentElement)
        });
    }

}