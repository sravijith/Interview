from docx import Document

def extract_hyperlinks_and_text(doc_path):
    doc = Document(doc_path)

    hyperlinks = []
    text = ""

    for paragraph in doc.paragraphs:
        text += paragraph.text + "\n"

        for run in paragraph.runs:
            print(repr(run))
            for hyperlink in run.element.findall('.//{http://schemas.openxmlformats.org/wordprocessingml/2006/main}hyperlink'):
                url = hyperlink.get('{http://schemas.openxmlformats.org/officeDocument/2006/relationships}id')
                text_in_run = run.text
                hyperlinks.append({
                    "text": text_in_run,
                    "url": url
                })
            if run.hyperlink is not None:
                hyperlinks.append({
                    "text": run.text,
                    "url": run.hyperlink.address
                })

    return text, hyperlinks

# Replace 'your_document.docx' with the path to your Word document
doc_path = '/Users/ajithkumargaade/Ajith/Tutorials/Python/Tim Buchalka/Source code for all Programs.docx'
text_content, hyperlinks_list = extract_hyperlinks_and_text(doc_path)

# Print the extracted text
print("Text Content:")
print(text_content)

# Print the extracted hyperlinks
print("\nHyperlinks:")
for hyperlink in hyperlinks_list:
    print(f"Text: {hyperlink['text']}")
    print(f"URL: {hyperlink['url']}")
    print()
