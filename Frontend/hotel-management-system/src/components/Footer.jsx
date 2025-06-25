import React from 'react'

const Footer = () => {
    return (
        <>
        <footer className="footer">
            <div className="container-fluid">
                <div className="row">
                <div className="col-md-6">
                    <div> © Ubold - <a href="../../../index.html" target="_blank">Coderthemes.com</a></div>
                </div>
                <div className="col-md-6">
                    <div className="d-none d-md-flex gap-4 align-item-center justify-content-md-end footer-links">
                    <a href="javascript: void(0);">About</a>
                    <a href="javascript: void(0);">Support</a>
                    <a href="javascript: void(0);">Contact Us</a>
                    </div>
                </div>
                </div>
            </div>
        </footer>
        </>

    )
}

export default Footer;