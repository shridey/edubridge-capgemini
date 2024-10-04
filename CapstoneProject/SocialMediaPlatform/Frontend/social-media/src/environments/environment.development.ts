const http_security: string = 'http'
const domain: string = 'localhost'
const port: number = 8080

export const environment = {
    production: false,
    api_users: `${http_security}://${domain}:${port}/api/users`,
    api_auth: `${http_security}://${domain}:${port}/api/users/auth`,
    api_profiles: `${http_security}://${domain}:${port}/api/profiles`,
    api_posts: `${http_security}://${domain}:${port}/api/posts`,
};