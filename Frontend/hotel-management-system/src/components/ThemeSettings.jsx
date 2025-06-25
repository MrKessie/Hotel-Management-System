import React from 'react'

const ThemeSettings = () => {
    return (
        <>
        <div className="offcanvas offcanvas-end right-bar" tabIndex={-1} id="theme-settings-offcanvas">
            <div className="d-flex align-items-center w-100 p-0 offcanvas-header">
                {/* Nav tabs */}
                <ul className="nav nav-tabs nav-bordered nav-justified w-100" role="tablist">
                <li className="nav-item">
                    <a className="nav-link py-2" data-bs-toggle="tab" href="index.html#chat-tab" role="tab">
                    <i className="mdi mdi-message-text d-block font-22 my-1" />
                    </a>
                </li>
                <li className="nav-item">
                    <a className="nav-link py-2" data-bs-toggle="tab" href="index.html#tasks-tab" role="tab">
                    <i className="mdi mdi-format-list-checkbox d-block font-22 my-1" />
                    </a>
                </li>
                <li className="nav-item">
                    <a className="nav-link py-2 active" data-bs-toggle="tab" href="index.html#settings-tab" role="tab">
                    <i className="mdi mdi-cog-outline d-block font-22 my-1" />
                    </a>
                </li>
                </ul>
            </div>
            <div className="offcanvas-body p-3 h-100" data-simplebar>
                {/* Tab panes */}
                <div className="tab-content pt-0">
                <div className="tab-pane" id="chat-tab" role="tabpanel">
                    <form className="search-bar">
                    <div className="position-relative">
                        <input type="text" className="form-control" placeholder="Search..." />
                        <span className="mdi mdi-magnify" />
                    </div>
                    </form>
                    <h6 className="fw-medium mt-2 text-uppercase">Group Chats</h6>
                    <div>
                    <a href="javascript: void(0);" className="text-reset notification-item ps-3 mb-2 d-block">
                        <i className="mdi mdi-checkbox-blank-circle-outline me-1 text-success" />
                        <span className="mb-0 mt-1">App Development</span>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item ps-3 mb-2 d-block">
                        <i className="mdi mdi-checkbox-blank-circle-outline me-1 text-warning" />
                        <span className="mb-0 mt-1">Office Work</span>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item ps-3 mb-2 d-block">
                        <i className="mdi mdi-checkbox-blank-circle-outline me-1 text-danger" />
                        <span className="mb-0 mt-1">Personal Group</span>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item ps-3 d-block">
                        <i className="mdi mdi-checkbox-blank-circle-outline me-1" />
                        <span className="mb-0 mt-1">Freelance</span>
                    </a>
                    </div>
                    <h6 className="fw-medium mt-3 text-uppercase">Favourites <a href="javascript: void(0);" className="font-18 text-danger"><i className="float-end mdi mdi-plus-circle" /></a></h6>
                    <div>
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-10.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status online" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Andrew Mackie</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">It will seem like simplified English.</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-1.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status away" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Rory Dalyell</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">To an English person, it will seem like simplified</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-9.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status busy" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Jaxon Dunhill</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">To achieve this, it would be necessary.</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    </div>
                    <h6 className="fw-medium mt-3 text-uppercase">Other Chats <a href="javascript: void(0);" className="font-18 text-danger"><i className="float-end mdi mdi-plus-circle" /></a></h6>
                    <div className="pb-4">
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-2.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status online" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Jackson Therry</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">Everyone realizes why a new common language.</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-4.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status away" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Charles Deakin</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">The languages only differ in their grammar.</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-5.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status online" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Ryan Salting</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">If several languages coalesce the grammar of the resulting.</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-6.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status online" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Sean Howse</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">It will seem like simplified English.</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-7.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status busy" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Dean Coward</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">The new common language will be more simple.</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset notification-item">
                        <div className="d-flex align-items-start noti-user-item">
                        <div className="position-relative me-2">
                            <img src="assets/images/users/user-8.jpg" className="rounded-circle avatar-sm" alt="user-pic" />
                            <i className="mdi mdi-circle user-status away" />
                        </div>
                        <div className="overflow-hidden">
                            <h6 className="mt-0 mb-1 font-14">Hayley East</h6>
                            <div className="font-13 text-muted">
                            <p className="mb-0 text-truncate">One could refuse to pay expensive translators.</p>
                            </div>
                        </div>
                        </div>
                    </a>
                    <div className="text-center mt-3">
                        <a href="javascript:void(0);" className="btn btn-sm btn-white">
                        <i className="mdi mdi-spin mdi-loading me-2" />
                        Load more
                        </a>
                    </div>
                    </div>
                </div>
                <div className="tab-pane" id="tasks-tab" role="tabpanel">
                    <h6 className="fw-medium p-3 m-0 text-uppercase">Working Tasks</h6>
                    <div className="px-2">
                    <a href="javascript: void(0);" className="text-reset item-hovered d-block p-2">
                        <p className="text-muted mb-0">App Development<span className="float-end">75%</span></p>
                        <div className="progress mt-2" style={{height: 4}}>
                        <div className="progress-bar bg-success" role="progressbar" style={{width: '75%'}} aria-valuenow={75} aria-valuemin={0} aria-valuemax={100} />
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset item-hovered d-block p-2">
                        <p className="text-muted mb-0">Database Repair<span className="float-end">37%</span></p>
                        <div className="progress mt-2" style={{height: 4}}>
                        <div className="progress-bar bg-info" role="progressbar" style={{width: '37%'}} aria-valuenow={37} aria-valuemin={0} aria-valuemax={100} />
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset item-hovered d-block p-2">
                        <p className="text-muted mb-0">Backup Create<span className="float-end">52%</span></p>
                        <div className="progress mt-2" style={{height: 4}}>
                        <div className="progress-bar bg-warning" role="progressbar" style={{width: '52%'}} aria-valuenow={52} aria-valuemin={0} aria-valuemax={100} />
                        </div>
                    </a>
                    </div>
                    <h6 className="fw-medium mb-0 mt-4 text-uppercase">Upcoming Tasks</h6>
                    <div>
                    <a href="javascript: void(0);" className="text-reset item-hovered d-block p-2">
                        <p className="text-muted mb-0">Sales Reporting<span className="float-end">12%</span></p>
                        <div className="progress mt-2" style={{height: 4}}>
                        <div className="progress-bar bg-danger" role="progressbar" style={{width: '12%'}} aria-valuenow={12} aria-valuemin={0} aria-valuemax={100} />
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset item-hovered d-block p-2">
                        <p className="text-muted mb-0">Redesign Website<span className="float-end">67%</span></p>
                        <div className="progress mt-2" style={{height: 4}}>
                        <div className="progress-bar bg-primary" role="progressbar" style={{width: '67%'}} aria-valuenow={67} aria-valuemin={0} aria-valuemax={100} />
                        </div>
                    </a>
                    <a href="javascript: void(0);" className="text-reset item-hovered d-block p-2">
                        <p className="text-muted mb-0">New Admin Design<span className="float-end">84%</span></p>
                        <div className="progress mt-2" style={{height: 4}}>
                        <div className="progress-bar bg-success" role="progressbar" style={{width: '84%'}} aria-valuenow={84} aria-valuemin={0} aria-valuemax={100} />
                        </div>
                    </a>
                    </div>
                    <div className="p-3 mt-2 d-grid">
                    <a href="javascript: void(0);" className="btn btn-success waves-effect waves-light">Create Task</a>
                    </div>
                </div>
                <div className="tab-pane active" id="settings-tab" role="tabpanel">
                    <div className="mt-n3">
                    <h6 className="fw-medium py-2 px-3 font-13 text-uppercase bg-light mx-n3 mt-n3 mb-3">
                        <span className="d-block py-1">Theme Settings</span>
                    </h6>
                    </div>
                    <div className="alert alert-warning" role="alert">
                    <strong>Customize </strong> the overall color scheme, sidebar menu, etc.
                    </div>
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Color Scheme</h5>
                    <div className="colorscheme-cardradio">
                    <div className="d-flex flex-column gap-2">
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-bs-theme" id="layout-color-light" defaultValue="light" />
                        <label className="form-check-label" htmlFor="layout-color-light">Light</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-bs-theme" id="layout-color-dark" defaultValue="dark" />
                        <label className="form-check-label" htmlFor="layout-color-dark">Dark</label>
                        </div>
                    </div>
                    </div>
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Content Width</h5>
                    <div className="d-flex flex-column gap-2">
                    <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-layout-width" id="layout-width-default" defaultValue="default" />
                        <label className="form-check-label" htmlFor="layout-width-default">Fluid (Default)</label>
                    </div>
                    <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-layout-width" id="layout-width-boxed" defaultValue="boxed" />
                        <label className="form-check-label" htmlFor="layout-width-boxed">Boxed</label>
                    </div>
                    </div>
                    <div id="layout-mode">
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Layout Mode</h5>
                    <div className="d-flex flex-column gap-2">
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-layout-mode" id="layout-mode-default" defaultValue="default" />
                        <label className="form-check-label" htmlFor="layout-mode-default">Default</label>
                        </div>
                        <div id="layout-detached">
                        <div className="form-check form-switch">
                            <input className="form-check-input" type="checkbox" name="data-layout-mode" id="layout-mode-detached" defaultValue="detached" />
                            <label className="form-check-label" htmlFor="layout-mode-detached">Detached</label>
                        </div>
                        </div>
                    </div>
                    </div>
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Topbar Color</h5>
                    <div className="d-flex flex-column gap-2">
                    <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-topbar-color" id="topbar-color-light" defaultValue="light" />
                        <label className="form-check-label" htmlFor="topbar-color-light">Light</label>
                    </div>
                    <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-topbar-color" id="topbar-color-dark" defaultValue="dark" />
                        <label className="form-check-label" htmlFor="topbar-color-dark">Dark</label>
                    </div>
                    <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-topbar-color" id="topbar-color-brand" defaultValue="brand" />
                        <label className="form-check-label" htmlFor="topbar-color-brand">Brand</label>
                    </div>
                    </div>
                    <div>
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Menu Color</h5>
                    <div className="d-flex flex-column gap-2">
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-menu-color" id="leftbar-color-light" defaultValue="light" />
                        <label className="form-check-label" htmlFor="leftbar-color-light">Light</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-menu-color" id="leftbar-color-dark" defaultValue="dark" />
                        <label className="form-check-label" htmlFor="leftbar-color-dark">Dark</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-menu-color" id="leftbar-color-brand" defaultValue="brand" />
                        <label className="form-check-label" htmlFor="leftbar-color-brand">Brand</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-menu-color" id="leftbar-color-gradient" defaultValue="gradient" />
                        <label className="form-check-label" htmlFor="leftbar-color-gradient">Gradient</label>
                        </div>
                    </div>
                    </div>
                    <div id="menu-icon-color">
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Menu Icon Color</h5>
                    <div className="d-flex flex-column gap-2">
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-two-column-color" id="twocolumn-menu-color-light" defaultValue="light" />
                        <label className="form-check-label" htmlFor="twocolumn-menu-color-light">Light</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-two-column-color" id="twocolumn-menu-color-dark" defaultValue="dark" />
                        <label className="form-check-label" htmlFor="twocolumn-menu-color-dark">Dark</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-two-column-color" id="twocolumn-menu-color-brand" defaultValue="brand" />
                        <label className="form-check-label" htmlFor="twocolumn-menu-color-brand">Brand</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-two-column-color" id="twocolumn-menu-color-gradient" defaultValue="gradient" />
                        <label className="form-check-label" htmlFor="twocolumn-menu-color-gradient">Gradient</label>
                        </div>
                    </div>
                    </div>
                    <div>
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Menu Icon Tone</h5>
                    <div className="d-flex flex-column gap-2">
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-menu-icon" id="menu-icon-default" defaultValue="default" />
                        <label className="form-check-label" htmlFor="menu-icon-default">Default</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-menu-icon" id="menu-icon-twotone" defaultValue="twotones" />
                        <label className="form-check-label" htmlFor="menu-icon-twotone">Twotone</label>
                        </div>
                    </div>
                    </div>
                    <div id="sidebar-size">
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Sidebar Size</h5>
                    <div className="d-flex flex-column gap-2">
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-sidenav-size" id="leftbar-size-default" defaultValue="default" />
                        <label className="form-check-label" htmlFor="leftbar-size-default">Default</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-sidenav-size" id="leftbar-size-compact" defaultValue="compact" />
                        <label className="form-check-label" htmlFor="leftbar-size-compact">Compact (Medium Width)</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-sidenav-size" id="leftbar-size-small" defaultValue="condensed" />
                        <label className="form-check-label" htmlFor="leftbar-size-small">Condensed (Icon View)</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-sidenav-size" id="leftbar-size-full" defaultValue="full" />
                        <label className="form-check-label" htmlFor="leftbar-size-full">Full Layout</label>
                        </div>
                        <div className="form-check form-switch">
                        <input className="form-check-input" type="checkbox" name="data-sidenav-size" id="leftbar-size-fullscreen" defaultValue="fullscreen" />
                        <label className="form-check-label" htmlFor="leftbar-size-fullscreen">Fullscreen Layout</label>
                        </div>
                    </div>
                    </div>
                    <div id="sidebar-user">
                    <h5 className="fw-medium font-14 mt-4 mb-2 pb-1">Sidebar User Info</h5>
                    <div className="form-check form-switch">
                        <input type="checkbox" className="form-check-input" name="data-sidebar-user" id="sidebaruser-check" />
                        <label className="form-check-label" htmlFor="sidebaruser-check">Enable</label>
                    </div>
                    </div>
                </div>
                </div>
            </div>
            <div className="offcanvas-footer border-top py-2 px-2 text-center">
                <div className="d-flex gap-2">
                <button type="button" className="btn btn-light w-50" id="reset-layout">Reset</button>
                <a href="https://1.envato.market/uboldadmin" className="btn btn-danger w-50" target="_blank"><i className="mdi mdi-basket me-1" /> Buy</a>
                </div>
            </div>
            </div>

        </>
    )
}