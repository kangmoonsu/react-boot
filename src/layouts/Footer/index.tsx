import React from 'react'
import './style.css';

//          component : Footer Layout           //
export default function Footer() {
    //          event handler: 인스타 아이콘 버튼 이벤트 처리           //
    const onInstaIconButtonClickHandler = () => {
        window.open('https://www.instagram.com/97_moon_su_/');
    }
    //          event handler: 네이버 아이콘 버튼 이벤트 처리           //
    const onTistoryIconButtonClickHandler = () => {
        window.open('https://developer-michael.tistory.com/');
    }
    //          render : Footer Layout Rendering            //
    return (
        <div id='footer'>
            <div className='footer-container'>
                <div className='footer-top'>
                    <div className='footer-logo-box'>
                        <div className='icon-box'>
                            <div className='icon logo-light-icon'></div>
                        </div>
                        <div className='footer-logo-text'>{'Moons Board'}</div>
                    </div>
                    <div className='footer-link-box'>
                        <div className='footer-email-link'>{'contact.michaeldev@gmail.com'}</div>
                        <div className='icon-button' onClick={onInstaIconButtonClickHandler}>
                            <div className='icon insta-icon'></div>
                        </div>
                        <div className='icon-button' onClick={onTistoryIconButtonClickHandler}>
                            <div className='icon tistory-icon'></div>
                        </div>
                    </div>
                </div>
                <div className='footer-bottom'>
                    <div className='footer-copyright'>{'Copyright © 2024 Moonsu. All Rights Reserved.'}</div>
                </div>
            </div>
        </div>
    )
}
