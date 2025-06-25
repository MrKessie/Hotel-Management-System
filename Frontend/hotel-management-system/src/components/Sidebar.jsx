import React from 'react'

const Sidebar = () => {
    return (
        <>
        <div className="app-menu">
            {/* Brand Logo */}
            <div className="logo-box">
                {/* Brand Logo Light */}
                <a href="index.html" className="logo-light">
                <img src="assets/images/logo-light.png" alt="logo" className="logo-lg" />
                <img src="assets/images/logo-sm.png" alt="small logo" className="logo-sm" />
                </a>
                {/* Brand Logo Dark */}
                <a href="index.html" className="logo-dark">
                <img src="assets/images/logo-dark.png" alt="dark logo" className="logo-lg" />
                <img src="assets/images/logo-sm.png" alt="small logo" className="logo-sm" />
                </a>
            </div>
            {/* menu-left */}
            <div className="scrollbar">
                {/* User box */}
                <div className="user-box text-center">
                <img src="assets/images/users/user-1.jpg" alt="user-img" title="Mat Helme" className="rounded-circle avatar-md" />
                <div className="dropdown">
                    <a href="javascript: void(0);" className="dropdown-toggle h5 mb-1 d-block" data-bs-toggle="dropdown">Geneva Kennedy</a>
                    <div className="dropdown-menu user-pro-dropdown">
                    {/* item*/}
                    <a href="javascript:void(0);" className="dropdown-item notify-item">
                        <i className="fe-user me-1" />
                        <span>My Account</span>
                    </a>
                    {/* item*/}
                    <a href="javascript:void(0);" className="dropdown-item notify-item">
                        <i className="fe-settings me-1" />
                        <span>Settings</span>
                    </a>
                    {/* item*/}
                    <a href="javascript:void(0);" className="dropdown-item notify-item">
                        <i className="fe-lock me-1" />
                        <span>Lock Screen</span>
                    </a>
                    {/* item*/}
                    <a href="javascript:void(0);" className="dropdown-item notify-item">
                        <i className="fe-log-out me-1" />
                        <span>Logout</span>
                    </a>
                    </div>
                </div>
                <p className="text-muted mb-0">Admin Head</p>
                </div>
                {/*- Menu */}
                <ul className="menu">
                <li className="menu-title">Navigation</li>
                <li className="menu-item">
                    <a href="index.html#menuDashboards" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="airplay" /></span>
                    <span className="menu-text"> Dashboards </span>
                    <span className="badge bg-success rounded-pill ms-auto">4</span>
                    </a>
                    <div className="collapse" id="menuDashboards">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="index.html" className="menu-link">
                            <span className="menu-text">Dashboard 1</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="dashboard-2.html" className="menu-link">
                            <span className="menu-text">Dashboard 2</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="dashboard-3.html" className="menu-link">
                            <span className="menu-text">Dashboard 3</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="dashboard-4.html" className="menu-link">
                            <span className="menu-text">Dashboard 4</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-title">Apps</li>
                <li className="menu-item">
                    <a href="apps-calendar.html" className="menu-link">
                    <span className="menu-icon"><i data-feather="calendar" /></span>
                    <span className="menu-text"> Calendar </span>
                    </a>
                </li>
                <li className="menu-item">
                    <a href="apps-chat.html" className="menu-link">
                    <span className="menu-icon"><i data-feather="message-square" /></span>
                    <span className="menu-text"> Chat </span>
                    </a>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuEcommerce" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="shopping-cart" /></span>
                    <span className="menu-text"> Ecommerce </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuEcommerce">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="ecommerce-dashboard.html" className="menu-link">
                            <span className="menu-text">Dashboard</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-products.html" className="menu-link">
                            <span className="menu-text">Products</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-product-detail.html" className="menu-link">
                            <span className="menu-text">Product Detail</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-product-edit.html" className="menu-link">
                            <span className="menu-text">Add Product</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-customers.html" className="menu-link">
                            <span className="menu-text">Customers</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-orders.html" className="menu-link">
                            <span className="menu-text">Orders</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-order-detail.html" className="menu-link">
                            <span className="menu-text">Order Detail</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-sellers.html" className="menu-link">
                            <span className="menu-text">Sellers</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-cart.html" className="menu-link">
                            <span className="menu-text">Shopping Cart</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ecommerce-checkout.html" className="menu-link">
                            <span className="menu-text">Checkout</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuCrm" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="users" /></span>
                    <span className="menu-text"> CRM </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuCrm">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="crm-dashboard.html" className="menu-link">
                            <span className="menu-text">Dashboard</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="crm-contacts.html" className="menu-link">
                            <span className="menu-text">Contacts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="crm-opportunities.html" className="menu-link">
                            <span className="menu-text">Opportunities</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="crm-leads.html" className="menu-link">
                            <span className="menu-text">Leads</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="crm-customers.html" className="menu-link">
                            <span className="menu-text">Customers</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuEmail" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="mail" /></span>
                    <span className="menu-text"> Email </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuEmail">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="email-inbox.html" className="menu-link">
                            <span className="menu-text">Inbox</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="email-read.html" className="menu-link">
                            <span className="menu-text">Read Email</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="email-compose.html" className="menu-link">
                            <span className="menu-text">Compose Email</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="email-templates.html" className="menu-link">
                            <span className="menu-text">Email Templates</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="apps-social-feed.html" className="menu-link">
                    <span className="menu-icon"><i data-feather="rss" /></span>
                    <span className="menu-text"> Social Feed </span>
                    <span className="badge bg-pink ms-auto">Hot</span>
                    </a>
                </li>
                <li className="menu-item">
                    <a href="apps-companies.html" className="menu-link">
                    <span className="menu-icon"><i data-feather="activity" /></span>
                    <span className="menu-text"> Companies </span>
                    </a>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuProjects" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="briefcase" /></span>
                    <span className="menu-text"> Projects </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuProjects">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="project-list.html" className="menu-link">
                            <span className="menu-text">List</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="project-detail.html" className="menu-link">
                            <span className="menu-text">Detail</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="project-create.html" className="menu-link">
                            <span className="menu-text">Create Project</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuTasks" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="clipboard" /></span>
                    <span className="menu-text"> Tasks </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuTasks">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="task-list.html" className="menu-link">
                            <span className="menu-text">List</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="task-details.html" className="menu-link">
                            <span className="menu-text">Details</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="task-kanban-board.html" className="menu-link">
                            <span className="menu-text">Kanban Board</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuContacts" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="book" /></span>
                    <span className="menu-text"> Contacts </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuContacts">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="contacts-list.html" className="menu-link">
                            <span className="menu-text">Members List</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="contacts-profile.html" className="menu-link">
                            <span className="menu-text">Profile</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuTickets" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="aperture" /></span>
                    <span className="menu-text"> Tickets </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuTickets">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="tickets-list.html" className="menu-link">
                            <span className="menu-text">List</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="tickets-detail.html" className="menu-link">
                            <span className="menu-text">Detail</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="apps-file-manager.html" className="menu-link">
                    <span className="menu-icon"><i data-feather="folder-plus" /></span>
                    <span className="menu-text"> File Manager </span>
                    </a>
                </li>
                <li className="menu-title">Custom</li>
                <li className="menu-item">
                    <a href="index.html#menuAuth" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="file-text" /></span>
                    <span className="menu-text"> Auth Pages </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse collapse-md" id="menuAuth">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="auth-login.html" className="menu-link">
                            <span className="menu-text">Log In</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-login-2.html" className="menu-link">
                            <span className="menu-text">Log In 2</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-register.html" className="menu-link">
                            <span className="menu-text">Register</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-register-2.html" className="menu-link">
                            <span className="menu-text">Register 2</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-signin-signup.html" className="menu-link">
                            <span className="menu-text">Signin - Signup</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-signin-signup-2.html" className="menu-link">
                            <span className="menu-text">Signin - Signup 2</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-recoverpw.html" className="menu-link">
                            <span className="menu-text">Recover Password</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-recoverpw-2.html" className="menu-link">
                            <span className="menu-text">Recover Password 2</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-lock-screen.html" className="menu-link">
                            <span className="menu-text">Lock Screen</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-lock-screen-2.html" className="menu-link">
                            <span className="menu-text">Lock Screen 2</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-logout.html" className="menu-link">
                            <span className="menu-text">Logout</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-logout-2.html" className="menu-link">
                            <span className="menu-text">Logout 2</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-confirm-mail.html" className="menu-link">
                            <span className="menu-text">Confirm Mail</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="auth-confirm-mail-2.html" className="menu-link">
                            <span className="menu-text">Confirm Mail 2</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuExpages" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="package" /></span>
                    <span className="menu-text"> Extra Pages </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuExpages">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="pages-starter.html" className="menu-link">
                            <span className="menu-text">Starter</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-timeline.html" className="menu-link">
                            <span className="menu-text">Timeline</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-sitemap.html" className="menu-link">
                            <span className="menu-text">Sitemap</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-invoice.html" className="menu-link">
                            <span className="menu-text">Invoice</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-faqs.html" className="menu-link">
                            <span className="menu-text">FAQs</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-search-results.html" className="menu-link">
                            <span className="menu-text">Search Results</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-pricing.html" className="menu-link">
                            <span className="menu-text">Pricing</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-maintenance.html" className="menu-link">
                            <span className="menu-text">Maintenance</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-coming-soon.html" className="menu-link">
                            <span className="menu-text">Coming Soon</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-gallery.html" className="menu-link">
                            <span className="menu-text">Gallery</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-404.html" className="menu-link">
                            <span className="menu-text">Error 404</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-404-two.html" className="menu-link">
                            <span className="menu-text">Error 404 Two</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-404-alt.html" className="menu-link">
                            <span className="menu-text">Error 404-alt</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-500.html" className="menu-link">
                            <span className="menu-text">Error 500</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="pages-500-two.html" className="menu-link">
                            <span className="menu-text">Error 500 Two</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuLayouts" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="layout" /></span>
                    <span className="menu-text"> Layouts </span>
                    <span className="badge bg-blue ms-auto">New</span>
                    </a>
                    <div className="collapse" id="menuLayouts">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="layouts-horizontal.html" target="_blank" className="menu-link">
                            <span className="menu-text">Horizontal</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="layouts-detached.html" target="_blank" className="menu-link">
                            <span className="menu-text">Detached</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="layouts-two-column.html" target="_blank" className="menu-link">
                            <span className="menu-text">Two Column Menu</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="layouts-two-tone-icons.html" target="_blank" className="menu-link">
                            <span className="menu-text">Two Tones Icons</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="layouts-preloader.html" target="_blank" className="menu-link">
                            <span className="menu-text">Preloader</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-title">Components</li>
                <li className="menu-item">
                    <a href="index.html#menuBaseui" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="pocket" /></span>
                    <span className="menu-text"> Base UI </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse collapse-md" id="menuBaseui">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="ui-buttons.html" className="menu-link">
                            <span className="menu-text">Buttons</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-cards.html" className="menu-link">
                            <span className="menu-text">Cards</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-avatars.html" className="menu-link">
                            <span className="menu-text">Avatars</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-portlets.html" className="menu-link">
                            <span className="menu-text">Portlets</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-tabs-accordions.html" className="menu-link">
                            <span className="menu-text">Tabs &amp; Accordions</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-modals.html" className="menu-link">
                            <span className="menu-text">Modals</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-progress.html" className="menu-link">
                            <span className="menu-text">Progress</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-notifications.html" className="menu-link">
                            <span className="menu-text">Notifications</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-offcanvas.html" className="menu-link">
                            <span className="menu-text">Offcanvas</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-placeholders.html" className="menu-link">
                            <span className="menu-text">Placeholders</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-spinners.html" className="menu-link">
                            <span className="menu-text">Spinners</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-images.html" className="menu-link">
                            <span className="menu-text">Images</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-carousel.html" className="menu-link">
                            <span className="menu-text">Carousel</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-list-group.html" className="menu-link">
                            <span className="menu-text">List Group</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-video.html" className="menu-link">
                            <span className="menu-text">Embed Video</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-dropdowns.html" className="menu-link">
                            <span className="menu-text">Dropdowns</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-ribbons.html" className="menu-link">
                            <span className="menu-text">Ribbons</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-tooltips-popovers.html" className="menu-link">
                            <span className="menu-text">Tooltips &amp; Popovers</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-general.html" className="menu-link">
                            <span className="menu-text">General UI</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-typography.html" className="menu-link">
                            <span className="menu-text">Typography</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="ui-grid.html" className="menu-link">
                            <span className="menu-text">Grid</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuExtendedui" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="layers" /></span>
                    <span className="menu-text"> Extended UI </span>
                    <span className="badge bg-info ms-auto">Hot</span>
                    </a>
                    <div className="collapse" id="menuExtendedui">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="extended-nestable.html" className="menu-link">
                            <span className="menu-text">Nestable List</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="extended-range-slider.html" className="menu-link">
                            <span className="menu-text">Range Slider</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="extended-dragula.html" className="menu-link">
                            <span className="menu-text">Dragula</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="extended-animation.html" className="menu-link">
                            <span className="menu-text">Animation</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="extended-sweet-alert.html" className="menu-link">
                            <span className="menu-text">Sweet Alert</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="extended-tour.html" className="menu-link">
                            <span className="menu-text">Tour Page</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="extended-scrollspy.html" className="menu-link">
                            <span className="menu-text">Scrollspy</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="extended-loading-buttons.html" className="menu-link">
                            <span className="menu-text">Loading Buttons</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="widgets.html" className="menu-link">
                    <span className="menu-icon"><i data-feather="gift" /></span>
                    <span className="menu-text"> Widgets </span>
                    </a>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuIcons" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="cpu" /></span>
                    <span className="menu-text"> Icons </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuIcons">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="icons-material-symbols.html" className="menu-link">
                            <span className="menu-text">Material Symbols </span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="icons-two-tone.html" className="menu-link">
                            <span className="menu-text">Two Tone Icons</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="icons-feather.html" className="menu-link">
                            <span className="menu-text">Feather Icons</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="icons-mdi.html" className="menu-link">
                            <span className="menu-text">Material Design Icons</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="icons-dripicons.html" className="menu-link">
                            <span className="menu-text">Dripicons</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="icons-font-awesome.html" className="menu-link">
                            <span className="menu-text">Font Awesome 5</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="icons-themify.html" className="menu-link">
                            <span className="menu-text">Themify</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="icons-simple-line.html" className="menu-link">
                            <span className="menu-text">Simple Line</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="icons-weather.html" className="menu-link">
                            <span className="menu-text">Weather</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuForms" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="bookmark" /></span>
                    <span className="menu-text"> Forms </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuForms">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="forms-elements.html" className="menu-link">
                            <span className="menu-text">General Elements</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-advanced.html" className="menu-link">
                            <span className="menu-text">Advanced</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-validation.html" className="menu-link">
                            <span className="menu-text">Validation</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-pickers.html" className="menu-link">
                            <span className="menu-text">Pickers</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-wizard.html" className="menu-link">
                            <span className="menu-text">Wizard</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-masks.html" className="menu-link">
                            <span className="menu-text">Masks</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-quilljs.html" className="menu-link">
                            <span className="menu-text">Quilljs Editor</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-file-uploads.html" className="menu-link">
                            <span className="menu-text">File Uploads</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-x-editable.html" className="menu-link">
                            <span className="menu-text">X Editable</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="forms-image-crop.html" className="menu-link">
                            <span className="menu-text">Image Crop</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuTables" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="grid" /></span>
                    <span className="menu-text"> Tables </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuTables">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="tables-basic.html" className="menu-link">
                            <span className="menu-text">Basic Tables</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="tables-datatables.html" className="menu-link">
                            <span className="menu-text">Data Tables</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="tables-editable.html" className="menu-link">
                            <span className="menu-text">Editable Tables</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="tables-responsive.html" className="menu-link">
                            <span className="menu-text">Responsive Tables</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="tables-footables.html" className="menu-link">
                            <span className="menu-text">FooTable</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="tables-bootstrap.html" className="menu-link">
                            <span className="menu-text">Bootstrap Tables</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="tables-tablesaw.html" className="menu-link">
                            <span className="menu-text">Tablesaw Tables</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="tables-jsgrid.html" className="menu-link">
                            <span className="menu-text">JsGrid Tables</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuCharts" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="bar-chart-2" /></span>
                    <span className="menu-text"> Charts </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuCharts">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="charts-apex.html" className="menu-link">
                            <span className="menu-text">Apex Charts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="charts-flot.html" className="menu-link">
                            <span className="menu-text">Flot Charts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="charts-morris.html" className="menu-link">
                            <span className="menu-text">Morris Charts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="charts-chartjs.html" className="menu-link">
                            <span className="menu-text">Chartjs Charts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="charts-peity.html" className="menu-link">
                            <span className="menu-text">Peity Charts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="charts-chartist.html" className="menu-link">
                            <span className="menu-text">Chartist Charts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="charts-c3.html" className="menu-link">
                            <span className="menu-text">C3 Charts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="charts-sparklines.html" className="menu-link">
                            <span className="menu-text">Sparklines Charts</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="charts-knob.html" className="menu-link">
                            <span className="menu-text">Jquery Knob Charts</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuMaps" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="map" /></span>
                    <span className="menu-text"> Maps </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuMaps">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="maps-google.html" className="menu-link">
                            <span className="menu-text">Google Maps</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="maps-vector.html" className="menu-link">
                            <span className="menu-text">Vector Maps</span>
                        </a>
                        </li>
                        <li className="menu-item">
                        <a href="maps-mapael.html" className="menu-link">
                            <span className="menu-text">Mapael Maps</span>
                        </a>
                        </li>
                    </ul>
                    </div>
                </li>
                <li className="menu-item">
                    <a href="index.html#menuMultilevel" data-bs-toggle="collapse" className="menu-link">
                    <span className="menu-icon"><i data-feather="share-2" /></span>
                    <span className="menu-text"> Multi Level </span>
                    <span className="menu-arrow" />
                    </a>
                    <div className="collapse" id="menuMultilevel">
                    <ul className="sub-menu">
                        <li className="menu-item">
                        <a href="index.html#menuMultilevel2" data-bs-toggle="collapse" className="menu-link">
                            <span className="menu-text"> Second Level </span>
                            <span className="menu-arrow" />
                        </a>
                        <div className="collapse" id="menuMultilevel2">
                            <ul className="sub-menu">
                            <li className="menu-item">
                                <a href="javascript: void(0);" className="menu-link">
                                <span className="menu-text">Item 1</span>
                                </a>
                            </li>
                            <li className="menu-item">
                                <a href="javascript: void(0);" className="menu-link">
                                <span className="menu-text">Item 2</span>
                                </a>
                            </li>
                            </ul>
                        </div>
                        </li>
                        <li className="menu-item">
                        <a href="index.html#menuMultilevel3" data-bs-toggle="collapse" className="menu-link">
                            <span className="menu-text">Third Level</span>
                            <span className="menu-arrow" />
                        </a>
                        <div className="collapse" id="menuMultilevel3">
                            <ul className="sub-menu">
                            <li className="menu-item">
                                <a href="javascript: void(0);" className="menu-link">
                                <span className="menu-text">Item 1</span>
                                </a>
                            </li>
                            <li className="menu-item">
                                <a href="index.html#menuMultilevel4" data-bs-toggle="collapse" className="menu-link">
                                <span className="menu-text">Item 2</span>
                                <span className="menu-arrow" />
                                </a>
                                <div className="collapse" id="menuMultilevel4">
                                <ul className="sub-menu">
                                    <li className="menu-item">
                                    <a href="javascript: void(0);" className="menu-link">
                                        <span className="menu-text">Item 1</span>
                                    </a>
                                    </li>
                                    <li className="menu-item">
                                    <a href="javascript: void(0);" className="menu-link">
                                        <span className="menu-text">Item 2</span>
                                    </a>
                                    </li>
                                </ul>
                                </div>
                            </li>
                            </ul>
                        </div>
                        </li>
                    </ul>
                    </div>
                </li>
                </ul>
                {/*- End Menu */}
                <div className="clearfix" />
            </div>
        </div>

        </>
    )
}

export default Sidebar;